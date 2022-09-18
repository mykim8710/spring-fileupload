# Spring - File Upload Study Project

## Project Spec
- 프로젝트 선택
    - Project: Gradle Project
    - Spring Boot: 2.7.3
    - Language: Java
    - Packaging: Jar
    - Java: 11
- Project Metadata
    - Group: com.example
    - Artifact: fileupload
    - Name: spring-fileupload
    - Package name: com.example.fileupload
- Dependencies: **Spring Web**, **Lombok** , **Thymeleaf**

## Spring - fileupload
- 서블릿과 파일 업로드
  - ServletUploadControllerV1
  - ServletUploadControllerV2
- 스프링과 파일 업로드
  - MultipartFile
- 예제로 구현하는 파일 업로드, 다운로드
  - **요구사항**
    - 상품을 관리
      - 상품 이름
      - 첨부파일 하나
      - 이미지 파일 여러개
    - 첨부파일을 업로드 다운로드 할 수 있다.
    - 업로드한 이미지를 웹 브라우저에서 확인할 수 있다.

```
└── src
    ├── main
    │   ├── java
    │   │   └── com.example.fileupload
    │   │               ├── domain
    │   │               │      ├── UploadFile(C)
    │   │               │      ├── Item(C)            
    │   │               │      └── ItemRepository(C) 
    │   │               ├── file
    │   │               │      └── FileStore(C)
    │   │               ├──  web
    │   │               │      ├── ItemFormDto(C)
    │   │               │      └── ItemRepository(C)
    │   │               └── SpringFileuploadApplication(C)
```