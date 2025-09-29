# DIO---Desafio-Iphone-UML-trilha-POO
Desafio Bootcamp Java Springboot Claro, trilha POO 
```mermaid
classDiagram
        Iphone <|-- ReprodutorMusical
        Iphone <|-- NavegadorInternet
        Iphone <|-- AparelhoTelefonico
       
        class ReprodutorMusical {
          
          +tocar()
          +pausar()
          +selecionarMusica(String musica)
        }
        class AparelhoTelefonico {
          
          +ligar(String numero)
          +atender()
          +iniciarCorreioVoz()
        }
        class NavegadorInternet {
          
          +exibirPagina(String url)
          +atualizarPagina()
          +adicionarNovaAba()
        }
```
