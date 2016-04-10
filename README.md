# CamargoPortas
Projeto da Camargo Portas, um site para controle de clientes de uma empresa de portões automaticos


 - Baixar o projeto
 - importar no Eclipse como Maven Project
 - Adciona o servidor do WildFly 9 com standalone-full.xml
 - Adicionar no projeto o library do Wildfly que foi criado no passo anterior
    - Clicar com o direito no projeto
    - Selecionar build path
    - Configure build path
    - Add Library
    - Server Runtime
    - Next 
    - Selecionar o servidor
    - Finish

 - Substituir o Standalone do seu WildFly com o que esta na pasta camargoPortasFiles do projeto
  ~> wildfly-9.0.2.Final/standalone/configuration/

 - Dentro deste arquivo esta a configuracao com o banco de dados, dentro da tag <datasources>
  Troque o usuario e senha do banco

 - O Ultimo passo da configuracao é colocar o jar do MySql no WildFly
  ~> wildfly-9.0.2.Final/module/system/layers/base/com/ 
    Criar uma pasta chamada mysql e dentro desta uma pasta chamada main
    Dentro desta pasta colocar o arquivo module.xml que esta na pasta camargoPortasFiles e o jar que pode ser baixado 
    (http://central.maven.org/maven2/mysql/mysql-connector-java/5.1.35/mysql-connector-java-5.1.35.jar)





