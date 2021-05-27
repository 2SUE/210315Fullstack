package com.sue.board7.user;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.sue.board7.MyUtils;

@WebServlet("/user/myPage")
public class UserMyPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MyUtils.openJSP("마이페이지", "user/userMyPage", request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String uploadPath = request.getRealPath("/res/img"); // 이 메소드는 곧 사라진다,
		
		String uploadPath = request.getServletContext().getRealPath("/res/img");
		int maxFileSize = 10_485_760; // 10 * 1024 * 1024 = 10MB
		
		System.out.println("uploadPath : " + uploadPath);
																										   // 같은 이름의 파일 넘버링		
		MultipartRequest multi = new MultipartRequest(request, uploadPath + "/temp", maxFileSize, "UTF-8", new DefaultFileRenamePolicy());
	
		int loginUserPk = MyUtils.getLoginUserPK(request);
		
		String targetFolder = uploadPath + "/user/" + loginUserPk;
		
		File folder = new File(targetFolder);
		
		// 해당 폴더가 있으면 true 없으면 false
		// mkdirs : 폴더 여러 개 생성 mkdir : 폴더 한 개 생성
		folder.mkdirs(); 
		
		String fileNm = multi.getFilesystemName("profileImg"); // input name
		System.out.println("fileNm : " + fileNm);
		
		// ~ 파일 확장자 구하기 ~ 
		int lastDotIdx = fileNm.lastIndexOf("."); // 마지막 . 찾고 인덱스 번호 리턴
		String ext = fileNm.substring(lastDotIdx); // 해당 인덱스부터 마지막 인덱스까지 
		// String ext = fileNm.substring(fileNm.lastIndexOf("."));

		// UUID 값 (랜덤 값 생성, 중복된 값 안 나온다~~~~)
		String newFileNm = UUID.randomUUID().toString() + ext;
		
		File imgFile = new File(uploadPath + "/temp" + "/" + fileNm);
		imgFile.renameTo(new File(targetFolder + "/" + newFileNm));
	}
}