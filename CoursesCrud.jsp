<%@page import="com.del.second.entity.Courses,com.del.second.dao.CoursesDAO" %>
<% 
   Courses cs = (Courses)request.getAttribute("cs");
   if(cs==null) cs =  new Courses();
%>
<!DOCTYPE html>
<html>
<body>
   <form action="CoursesCrudServlet">
   <table align=center width=50% bgcolor=lightblue>
   <tr>
       <th>Course Id</th>
       <td><input type=text name=id value =<%=cs.getCourse_id() %>></td>
   </tr>
   <tr>
       <th>Course Name</th>
       <td><input type=text name=name value = <%=cs.getCourse_name() %>></td>
   </tr>
   <tr>
       <th>Course Duration</th>
       <td><input type=text name=duration value = <%=cs.getCourse_duration() %>></td>
   </tr>
   <tr>
       <th>Course Fee</th>
       <td><input type=text name=fee value = <%=cs.getCourse_fee() %>></td>
    </tr>
    <tr>
       <td><input type=submit value=Add_Course name="sub"></td>
       <td><input type=submit value=Show_Course name="sub"></td>
    </tr>
    <tr>
       <td><input type=submit value=Delete_Course name="sub"></td>
       <td><input type=submit value=Modify_Course name="sub"></td>
     </tr>     
   </table>
   </form>
</body>
</html>