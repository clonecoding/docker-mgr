package com.jdddata.dockermgr.northbound;

import com.jdddata.dockermgr.adapter.webdav.WebDavClient;
import com.jdddata.dockermgr.common.constant.UploadConstants;
import com.jdddata.dockermgr.common.util.ResultGenerator;
import com.jdddata.dockermgr.common.vo.response.ResultVo;
import com.jdddata.dockermgr.service.impl.DockerContainerServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.text.MessageFormat;
import java.util.UUID;

/**
 * 类名称：UploadFilesController
 * 类描述：所有文件上传都走这里
 * 创建人：zhangHeng
 * 创建时间：2017/9/3.10:10
 * 修改备注：
 *
 * @version 1.0.0
 */
@RestController
public class FileUploadController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DockerContainerServiceImpl.class);

    @PostMapping("fileUpload")
    public ResultVo uploadFiles(@RequestParam("file") MultipartFile file) {
        /*获取类型*/
        String contentType = file.getContentType();
        /*获取文件名，带后缀*/
        String fileName = file.getOriginalFilename();
        /*获取文件大小*/
        Long size = file.getSize();
        String fileNameDownloadUrl = UploadConstants.UPLOAD_URL+MessageFormat.format("dockerfile/{0}/Dockerfile",UUID.randomUUID().toString());
        try {
            WebDavClient.uploadDockerFile(fileNameDownloadUrl,file.getInputStream());
        } catch (Exception e) {
            LOGGER.error("上传文件异常",e);
        }
        return ResultGenerator.getSuccess(fileNameDownloadUrl);
    }

    /**
     * 判断上传文件是否合法
     *
     * @return 如果符合返回true
     */
    private boolean JudgmentFormat(String suffix, Long size) {
        if (UploadConstants.IMAGETYPE.contains(suffix) && UploadConstants.SMALLIMGSIZE >= size) {
            return true;
        }
        if (UploadConstants.FILE_TYPE.contains(suffix) && UploadConstants.SIZE >= size) {
            return true;
        }
        return false;
    }

}
