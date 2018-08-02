package com.jdddata.dockermgr.common.constant;

import java.util.Arrays;
import java.util.List;

/**
 * 类名称：UploadProperties
 * 类描述：上传文件的参数
 * 创建人：张恒
 * 创建时间：2017/9/3.11:12
 * 修改备注：
 *
 * @version 1.0.0
 */
public class UploadConstants {

    public static final String UPLOAD_URL="http://192.168.136.159:8080/";

    public static final List<String> FILE_TYPE =Arrays.asList(".zip",".doc",".docx",".xls",".xlsx");

    public static final Long SIZE= 1048576L;

    public  static final Long MIDDLEIMG_SIZE=71680L;

    public static final Long SMALLIMGSIZE = 1024000L;

    public static final List<String> IMAGETYPE =Arrays.asList(".jpg",".txt",".jpeg",".png",".pdf",".JPG",".JPEG",".PNG");

    public static final String LOCATION = "upload-dir";

}
