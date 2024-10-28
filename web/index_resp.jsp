<jsp:useBean id="varPaciente" class="beans.Paciente"/>
<jsp:setProperty name="varPaciente" property="*" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body style="background-color: azure">
        <%
            float peso = varPaciente.getPeso();
            float altura = varPaciente.getAltura();
            if(peso == 0 || altura == 0){
                out.println("Peso/Altura Invalido(s)<br>");
            }else{
            float imc = varPaciente.getIMC();
            out.println("Peso: " + varPaciente.getPeso() + "<br>");
            out.println("Altura: " + varPaciente.getAltura() + "<br>");
            out.println("IMC: " + imc + "<br>");
            out.println(varPaciente.getNome() + ", ");
            out.println(varPaciente.getStatusIMC());
            }
            out.println("<hr><font size=1>");
            out.println("Aplicacao sendo executada em: " + application.getRealPath("/"));
            out.println("</font>");
        %>
    </body>
</html>
