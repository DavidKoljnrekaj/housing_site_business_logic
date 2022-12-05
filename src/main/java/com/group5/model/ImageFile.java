package com.group5.model;

public class ImageFile {
    public String base64Data;
    public String fileName;
    public String contentType;

    public ImageFile(String base64Data, String fileName, String contentType) {
        this.base64Data = base64Data;
        this.fileName = fileName;
        this.contentType = contentType;
    }

    public String getBase64Data() {
        return base64Data;
    }

    public String getFileName() {
        return fileName;
    }

    public String getContentType() {
        return contentType;
    }
}
