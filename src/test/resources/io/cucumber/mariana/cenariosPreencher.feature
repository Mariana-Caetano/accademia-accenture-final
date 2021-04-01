# language: pt
Funcionalidade: Preencher o formulario no site Tricentis
  Preencher formulario para orçamento de seguro de carro
  
        Cenario: Preencher Enter Vehicle Data
             Quando estou no site Tricentis
              E clico em uma opcao em Make
              E digito no campo Engine Performance "100"
              E escolho Date of Manufacture
              E seleciono Number of Seats
              E seleciono Fuel Type
              E digito no campo List Price"2500"
              E digito no campo License Plate Number
              E digito no campo Annual Mileage "10000"
             Entao clico no botao "Next"

  
        Cenario: Preencher Enter Insurant Data
            Dado que digito no campo First Name
              E digito no campo Last Name
              E escolho Date of Birth
              E clico na opcao de Gender
              E digito no campo Street Adress
              E escolho Country
              E digito no campo Zip Code
              E digito no campo City
              E escolho Occupation
              E escolho Hobbies
              E digito o Website
             Entao clico no proximo botao "Next"
      

        Cenario: Preencher Enter Product Data
             Quando seleciono uma data  no campo Start Date
              E seleciono um valor em Insurance Sum
              E escolho no campo Merit Rating
              E escolho no campo Damage Insurance
              E seleciono uma opcao em Optional Products
              E seleciono uma opcao em Courtesy Car
             Entao clico em "Next"
  
        Cenario: Escolher tipo de Select Price Option
             Quando escolho um preco
             Entao clico no botao seguinte "Next"

        Esquema do Cenario: Preencher os campos Send Quote
            Dado que digito o email "nanah.caetano@outlook.com"
              E digito um telefone "36841048"
              E escolho um nome de usuario "Mariana"
              E escolho uma senha "*****"
              E digito no campo Confirm Password "*****"
              E clico no botao de "Send"
             Entao devo ver a mesnagem "Sending e-mail success!"
              
 