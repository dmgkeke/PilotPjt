package com.sds.anyframe.mobile.amplt.rest;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class ImageController {
	 @RequestMapping(value="/uploadFile", method=RequestMethod.POST)
	    public @ResponseBody String handleFileUpload(@RequestParam("fileName") String name, @RequestParam("directory") String directory,
	            @RequestParam("file") MultipartFile file){
	        if (!file.isEmpty()) {
	            try {
	                byte[] bytes = file.getBytes();
	                String fileLocation = new File("static\\images").getAbsolutePath() + "\\" + name;
	                
	                BufferedOutputStream stream =
	                        new BufferedOutputStream(new FileOutputStream(fileLocation));
	                stream.write(bytes);
	                stream.close();
	                return "You successfully uploaded " + name + "!";
	            } catch (Exception e) {
	                return "You failed to upload " + name + " => " + e.getMessage();
	            }
	        } else {
	            return "You failed to upload " + name + " because the file was empty.";
	        }
	    }
}
