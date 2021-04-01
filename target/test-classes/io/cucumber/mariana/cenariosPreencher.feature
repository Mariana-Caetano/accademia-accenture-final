# language: pt
Funcionalidade: Preencher o formulario no site Tricentis
  Preencher formulario para orçamento de seguro de carro
  
        Cenario: Preencher Enter Vehicle Data
             Quando estou no site Tricentis
              E clico no campo Make e seleciona uma opcao
              E clico no campo Model e seleciono uma opcao
              E digito no campo Cylinder Capacity
              E digito no campo Engine Performance
              E digito no campo Date of Manufacture
              E clico no campo Number of Seats
              E clico no campo Right Hand Drive e seleciono
              E clico no campo Number of Seats e seleciono
              E clico no campo Fuel Type e seleciono
              E digito no campo Payload
              E digito no campo Total Weight
              E digito no campo List Price
              E odigito no campo License Plate Number
              E digito no campo Annual Mileage
             Entao clico em Next

  
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
              E clico em Picture
             Entao clico no botao Next
      

        Cenario: Preencher Enter Product Data
             Quando seleciono uma data  no campo Start Date
              E seleciono um valor em Insurance Sum
              E escolho no campo Merit Rating
              E escolho no campo Damage Insurance
              E seleciono uma opcao em Optional Products
              E seleciono uma opcao em Courtesy Car
             Entao clico em Next para preencher Price Option
  
        Cenario: Escolher tipo de Select Price Option
             Quando escolho um preco
             Entao clico no botao seguinte Next

        Esquema do Cenario: Preencher os campos Send Quote
            Dado que digito um email em Email
              E digito no campoPhone
              E escolho um nome de usuario no campo Username
              E escolho uma senha no campo Password
              E digito no campo Confirm Password
              E clico no botao de Send
             Entao devo ver a mesnagem "Sending e-mail success!"
              
 