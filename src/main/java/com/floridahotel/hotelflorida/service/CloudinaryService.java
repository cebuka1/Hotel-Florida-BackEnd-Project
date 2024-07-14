//package com.floridahotel.hotelflorida.service;
//
//import com.cloudinary.Cloudinary;
//import com.cloudinary.utils.ObjectUtils;
//import com.floridahotel.hotelflorida.exception.OurException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Service;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;
//
//
//    @Configuration
//    public class CloudinaryService {
//
//        private final Cloudinary cloudinary;
//
//        @Bean
//        public CloudinaryService(@Value("dhq5njbmu") String cloudName,
//                                 @Value("689837641184998") String apiKey,
//                                 @Value("ZiHwRpLSsrN2Emazyr4fgLbpBCg") String apiSecret) {
//            Map<String, String> config = new HashMap<>();
//            config.put("cloud_name", cloudName);
//            config.put("api_key", apiKey);
//            config.put("api_secret", apiSecret);
//            this.cloudinary = new Cloudinary(config);
//        }

        // Methods to interact with Cloudinary
//    }

    //${cloudinary.api_key}
//    @Value("dhq5njbmu")
//    private String cloudName;
//
//    @Value("689837641184998")
//    private String apiKey;
//
//    @Value("ZiHwRpLSsrN2Emazyr4fgLbpBCg")
//    private String apiSecret;
//
//    //CLOUDINARY_URL=cloudinary://<your_api_key>:<your_api_secret>@dhq5njbmu
//
//    private Cloudinary cloudinary;
//
//    public CloudinaryService(){
//        this.cloudinary = new Cloudinary(ObjectUtils.asMap(
//                "cloud_name", cloudName,
//                "api_key", apiKey,
//                "api_secret", apiSecret));
//    }
//
//    public String saveImageToCloudinary(MultipartFile photo) {
//        try{
//            Map uploadResult = cloudinary.uploader().upload(photo.getBytes(),
//                    ObjectUtils.emptyMap());
//            return uploadResult.get("url").toString();
//        }catch (IOException e){
//            e.printStackTrace();
//            throw new OurException("unable to upload image to Cloudinary: " + e.getMessage());
//        }
//
//    }
//}
