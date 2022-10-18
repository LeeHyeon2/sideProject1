package com.example.project.DTO;

import com.example.project.Entity.MemberEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberDTO {
    private Long memberId;
    private String memberEmail;
    private String memberPassword;
    private String memberProfile;
    private MultipartFile memberFile;


    //staticPath
    private static String filePath = "c:\\spring_img\\";

}
