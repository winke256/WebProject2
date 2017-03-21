<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Cliente Page</title>
  </head>
  <body>
    <form method="post" action="crudCliente">

      <label>ID:</label>
      <input type="text" id="idCliente" name="idCliente"/><br/>

      <label>Nome:</label>
      <input type="text" id="nomeCliente" name="nomeCliente"/><br/>

      <label>Email:</label>
      <input type="text" id="emailCliente" name="emailCliente"/><br/>

      <input type="submit" name="oQueFazer" value="Inserir" />
      <input type="submit" name="oQueFazer" value="Inserir" />
      <input type="submit" name="oQueFazer" value="Inserir" />
      <input type="submit" name="oQueFazer" value="Inserir" />

    </form>
  </body>
</html>
