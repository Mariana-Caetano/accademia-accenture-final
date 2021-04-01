# Teste no site Tricentis com Selenium

## Objetivo 🎯
Criar um caso de teste com cinco cenários  para o site **[Tricentis](http://sampleapp.tricentis.com/101/app.php)**

## Tecnologias 👩🏽‍💻
:heavy_check_mark: <b>Java</b><br>
Linguagem de programação para desenvolvimento de aplicação<br>

:heavy_check_mark: <b>Maven</b><br>
Gerenciador de dependência para o Java<br>

:heavy_check_mark: <b>Cucumber</b><br>
Framework responsável por traduzir uma linguagem humana em código Java<br>

:heavy_check_mark: <b>Selenium</b><br>
Framework responsável por fazer a integração do código Java com a linguagem Gutking(cucumber) abrindo o browser fazendo o teste de comportamento<br>

### Como utilizar:
- Pré requisitos:

Instalar o Java: https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR

Intalar o jdk: https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html


- Clone do projeto: 
```bash
git clone https://github.com/AmandaBarral
```

- Entrando na pasta do projeto: 
```bash
cd FinalProjectTricentis/
```

- Configurando Selenium no computador:<br>
Fazer o download do Chrome Web Driver e adiconar o arquivo (descompactado) dentro da pasta "driver" na raíz do projeto<br>https://chromedriver.chromium.org/downloads<br>
<br>Exemplo:<br>

<ul>
cd driver
curl https://chromedriver.storage.googleapis.com/89.0.4389.23/chromedriver_linux64.zip
unzip chromedriver_linux64.zip
rm -rf chromedriver_linux64.zip
cd ../driver
</ul>

- Limpando e validando Maven (Unix):
```bash
./mvnw clean
```

- Limpando e validando Maven (Windows):
```bash
mvnw.cmd clean
```

- Executando teste no Unix:
```bash
./test.sh
```

- Executando teste no Windows:
```bash
test.bat
```

#### Funcionalidade: Preencher o formulario no site Tricentis
  Preencher formulario para orçamento de seguro de carro

  