package springmvc.wenjianshangchuan;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class File {
	
	@RequestMapping("/upload")
	public String  fileMapping(@RequestParam("file")MultipartFile file) {
		String filename = file.getOriginalFilename();
		System.out.println(filename);
		String url=System.getProperty("user.dir")+"\\src\\main\\webapp\\"+filename;
		System.out.println(url);
		java.io.File file2 = new java.io.File(System.getProperty("user.dir")+"/src/main/webapp/"+filename);
		try {
			file.transferTo(file2);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "success";
	}
}
