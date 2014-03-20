<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleServerProxyid" scope="session" class="DefaultNamespace.ServerProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleServerProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleServerProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleServerProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        DefaultNamespace.Server getServer10mtemp = sampleServerProxyid.getServer();
if(getServer10mtemp == null){
%>
<%=getServer10mtemp %>
<%
}else{
        if(getServer10mtemp!= null){
        String tempreturnp11 = getServer10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String pValue_1id=  request.getParameter("pValue16");
        int pValue_1idTemp  = Integer.parseInt(pValue_1id);
        java.lang.String method13mtemp = sampleServerProxyid.method(pValue_1idTemp);
if(method13mtemp == null){
%>
<%=method13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(method13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>