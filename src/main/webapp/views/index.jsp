<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-BR">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="icon" type="image/x-icon" href="../images/logo.jpeg">
    <title>Pagina de Viagens</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
</head>

<body>
    <nav class="navbar navbar-expand-lg bg-body-tertiary">
        <div class="container-fluid">
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup"
                aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                <div class="navbar-nav">
                    <a class="nav-link" aria-current="page" href="./index.jsp">Home</a>
                    <a class="nav-link" href="destinos.jsp">Destinos</a>
                    <a class="nav-link" href="promocoes.jsp">Promoções</a>
                    <a class="nav-link" href="contatos.jsp">Contato</a>
                </div>
            </div>
            <button class="btn btn-outline-success" type="submit">login</button>
        </div>
    </nav>
    <section class="container-fluid"
        style="background-image: url(../images/pexels-asad-photo-maldives-1450353.jpg); background-size: cover; height:100vh; display: flex; align-items: center; justify-content: center;">

        <div class="card bg-warning" style="width: 50rem;">
            <div class="card-body">
                <div class="form-floating mb-3">
                    <input type="text" class="form-control"  placeholder="name">
                    <label >Nome</label>
                </div>
                <div class="form-floating mb-3">
                    <input type="email" class="form-control"  placeholder="name@example.com">
                    <label for="floatingInput">Email</label>
                </div>
                <div class="form-floating mb-3">
                    <input type="email" class="form-control" id="floatingInput" placeholder="sua localização">
                    <label for="floatingInput">CEP de Origem</label>
                </div>
                <div class="form-floating mb-3">
                    <input type="email" class="form-control" id="floatingInput" placeholder="name@example.com">
                    <label for="floatingInput">CEP de Destino</label>
                </div>
                <div class="container-fluid d-flex justify-content-between">
                    <h3><span class="badge bg-secondary">R$valor</span></h3>
                    <button type="submit" class="btn btn-primary">Cadastrar</button>
                </div>

            </div>
        </div>

    </section>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>
</body>

</html>