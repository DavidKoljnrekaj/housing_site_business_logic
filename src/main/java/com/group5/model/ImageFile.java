package com.group5.model;

import java.util.ArrayList;
import java.util.List;

public class ImageFile {
    public String base64data;
    public String fileName;
    public String contentType;

    public ImageFile(String base64data, String fileName, String contentType) {
        this.base64data = base64data;
        this.fileName = fileName;
        this.contentType = contentType;
    }

    public static List<ImageFile> fromGrpc(List<String> imageBase64DataList, List<String> imageContentTypeList, List<String> imageFileNameList) {
        List<ImageFile> images=new ArrayList<>();
        for (int i=0;i<imageFileNameList.size();i++)
        {
            images.add(new ImageFile(imageBase64DataList.get(i),imageContentTypeList.get(i),imageFileNameList.get(i)));
        }
        return images;
    }

    public String getBase64data() {
        return base64data;
    }

    public String getFileName() {
        return fileName;
    }

    public String getContentType() {
        return contentType;
    }

}
