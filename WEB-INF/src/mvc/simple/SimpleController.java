package mvc.simple;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleController extends HttpServlet{


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        processRequest(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
        //2단계 요청 파악
        //request 객체로 사용자 요청 파악
        String type = request.getParameter("type");
        //3단계 요청 기능 수행
        Object resultObject = null;

        if (type == null || type.equals("greeting")) {
            resultObject = "안녕하세요";
        }else if (type.equals("data")) {
            resultObject = new Date();
        }else{
            resultObject = "Invalid type";
        }


        //request나 session에 처리 결과 저장
        request.setAttribute("result", resultObject);


        //Request로 알맞은 뷰로 포워딩
        RequestDispatcher dispatcher = request.getRequestDispatcher("/simpleView.jsp");
        dispatcher.forward(request, response);
    }


}