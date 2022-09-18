package com.example.fileupload.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UploadFile {
    private String uploadFileName;
    private String storeFileName;
}
