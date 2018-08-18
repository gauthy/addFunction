<jsp:useBean id="add" scope="page" class="com.addcode.nissan.addcode"/>

<%  
    String answer=request.getParameter("num");
    add.func(answer);
%>