package com.jdddata.dockermgr.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonTest {
    public static final String json = "[\n" +
            "    {\n" +
            "        \"name\": \"DockerMgr-test\",\n" +
            "        \"pipelines\": [\n" +
            "            {\n" +
            "                \"label\": \"${COUNT}\",\n" +
            "                \"materials\": [\n" +
            "                    {\n" +
            "                        \"fingerprint\": \"3740f1cd1aca779ace8f2695a96b2870d55445d1ae6b537573962e2e50372bac\",\n" +
            "                        \"type\": \"Git\",\n" +
            "                        \"description\": \"URL: https://gezhiwei:******@gitlab.jdddata.com/gezhiwei/docker-mgr.git, Branch: master\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"stages\": [\n" +
            "                    {\n" +
            "                        \"name\": \"mvnDeployStage\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"name\": \"DockerMgr-maven\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"label\": \"${COUNT}\",\n" +
            "                \"materials\": [\n" +
            "                    {\n" +
            "                        \"fingerprint\": \"def230b6c423d1dc000cab482dc932f097f940c2d104be0d2dfb7aaf4f16886b\",\n" +
            "                        \"type\": \"Pipeline\",\n" +
            "                        \"description\": \"DockerMgr-maven\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"stages\": [\n" +
            "                    {\n" +
            "                        \"name\": \"buildDockerStage\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"name\": \"docker-mgr-image-buildDockertest\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"label\": \"${COUNT}\",\n" +
            "                \"materials\": [\n" +
            "                    {\n" +
            "                        \"fingerprint\": \"d6195bea060bde270cdadbc3855a46f01a8da9465d2bf7a920dbc3c8e46f3b80\",\n" +
            "                        \"type\": \"Pipeline\",\n" +
            "                        \"description\": \"docker-mgr-image-buildDockertest\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"stages\": [\n" +
            "                    {\n" +
            "                        \"name\": \"pullDockerImageStage\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"startDockerContainerStage\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"name\": \"docker-mgr-deployDockertest\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"label\": \"${COUNT}\",\n" +
            "                \"materials\": [\n" +
            "                    {\n" +
            "                        \"fingerprint\": \"d6195bea060bde270cdadbc3855a46f01a8da9465d2bf7a920dbc3c8e46f3b80\",\n" +
            "                        \"type\": \"Pipeline\",\n" +
            "                        \"description\": \"docker-mgr-image-buildDockertest\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"stages\": [\n" +
            "                    {\n" +
            "                        \"name\": \"pullDockerImageStage\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"startDockerContainerStage\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"name\": \"docker-mgr02-deployDockertest\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"label\": \"${COUNT}\",\n" +
            "                \"materials\": [\n" +
            "                    {\n" +
            "                        \"fingerprint\": \"d6195bea060bde270cdadbc3855a46f01a8da9465d2bf7a920dbc3c8e46f3b80\",\n" +
            "                        \"type\": \"Pipeline\",\n" +
            "                        \"description\": \"docker-mgr-image-buildDockertest\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"stages\": [\n" +
            "                    {\n" +
            "                        \"name\": \"pullDockerImageStage\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"startDockerContainerStage\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"name\": \"docker-mgr01-deployDockertest\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"label\": \"${COUNT}\",\n" +
            "                \"materials\": [\n" +
            "                    {\n" +
            "                        \"fingerprint\": \"d6195bea060bde270cdadbc3855a46f01a8da9465d2bf7a920dbc3c8e46f3b80\",\n" +
            "                        \"type\": \"Pipeline\",\n" +
            "                        \"description\": \"docker-mgr-image-buildDockertest\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"stages\": [\n" +
            "                    {\n" +
            "                        \"name\": \"pullDockerImageStage\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"startDockerContainerStage\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"name\": \"docker-mgr04-deployDockertest\"\n" +
            "            }\n" +
            "        ]\n" +
            "    },\n" +
            "    {\n" +
            "        \"name\": \"dac-test\",\n" +
            "        \"pipelines\": [\n" +
            "            {\n" +
            "                \"label\": \"${COUNT}\",\n" +
            "                \"materials\": [\n" +
            "                    {\n" +
            "                        \"fingerprint\": \"d932c31f7286655cf527017207565417130c62d31ae11a82d5d95e1b634a4f5c\",\n" +
            "                        \"type\": \"Git\",\n" +
            "                        \"description\": \"URL: https://gezhiwei:******@gitlab.jdddata.com/project/dac/dac.git, Branch: 1.0.0\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"stages\": [\n" +
            "                    {\n" +
            "                        \"name\": \"mvnDeployStage\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"name\": \"dac-maven\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"label\": \"${COUNT}\",\n" +
            "                \"materials\": [\n" +
            "                    {\n" +
            "                        \"fingerprint\": \"21f5854c4c71050083ceffa5d8077a965fb990e6e09a9d8cf4989aadb760e495\",\n" +
            "                        \"type\": \"Pipeline\",\n" +
            "                        \"description\": \"dac-maven\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"stages\": [\n" +
            "                    {\n" +
            "                        \"name\": \"buildDockerStage\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"pullDockerImageStage\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"startDockerContainerStage\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"name\": \"dac-schedule\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"label\": \"${COUNT}\",\n" +
            "                \"materials\": [\n" +
            "                    {\n" +
            "                        \"fingerprint\": \"21f5854c4c71050083ceffa5d8077a965fb990e6e09a9d8cf4989aadb760e495\",\n" +
            "                        \"type\": \"Pipeline\",\n" +
            "                        \"description\": \"dac-maven\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"stages\": [\n" +
            "                    {\n" +
            "                        \"name\": \"buildDockerStage\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"pullDockerImageStage\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"startDockerContainerStage\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"name\": \"dac-dowmload\"\n" +
            "            }\n" +
            "        ]\n" +
            "    }\n" +
            "]";

    public static void main(String[] args) {
        List<JSONObject> jsonObjects = JSON.parseArray(json,JSONObject.class);
        List<String> strings = new ArrayList<>();
        for (JSONObject jsonObject : jsonObjects) {
            if (jsonObject.getString("name").equalsIgnoreCase("DockerMgr-test")) {
                JSONArray pipelines = jsonObject.getJSONArray("pipelines");
                for (int i = 0; i < pipelines.size(); i++) {
                    JSONObject jobj = pipelines.getJSONObject(i);
                    strings.add(jobj.getString("name"));
                }
            }
        }
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
