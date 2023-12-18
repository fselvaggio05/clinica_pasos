<%@ page import="Entities.Usuario" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="stylesheet" href="/Vistas Proyecto ING/sidebars.css">

</head>


<body>

    <div class="container ">

        <% Usuario usr = (Usuario) session.getAttribute("usuario");%>
        <h5 class="small fst-italic text-right mt-3">Bienvenido <%=usr.getApellido()+", "+usr.getNombre()%></h5>

        <h4 class="text-center my-4 mb-5 text-decoration-underline fw-bold ">Registro turno</h4>

        <div>
            <label class="fs-6  fst-italic fw-bold mb-3 " for="">Seleccione una práctica</label>
            <select class="form-select mb-5" id="practica">
                <option value="1">Magnetoterapia</option>
                <option value="2">Ondas Rusas</option>
                <option value="3">Fisioterapia</option>
            </select>
        </div>

        <div>
            <label class="fs-6  fst-italic fw-bold mb-3" for="">Seleccione un profesional</label>
            <select class="form-select" id="practica">
                <option value="1">GODOY. Santiago</option>
                <option value="2">GARBIN, Andrea</option>
                <option value="3">RICCI, Gustravo</option>
            </select>
        </div>



        <div class="mt-4 container">
            <table class="table table-striped my-2">
                <thead>
                    <tr>
                        <th scope="col">Profesional</th>
                        <th scope="col">Turno disponible</th>

                    </tr>

                </thead>

                <tbody>

                    <tr>
                        <td>
                            <div class="form-check">
                                <input class="form-check-input" type="radio" name="flexRadioDefault"
                                    id="flexRadioDefault1">
                                <label class="form-check-label" for="flexRadioDefault1">
                                    GODOY. Santiago
                                </label>
                            </div>

                        </td>

                        <td>15/11/2023 14:00 hs</td>
                        <td></td>
                        <td></td>
                    </tr>

                    <tr>
                        <td>
                            <div class="form-check">
                                <input class="form-check-input" type="radio" name="flexRadioDefault"
                                    id="flexRadioDefault2" checked>
                                <label class="form-check-label" for="flexRadioDefault2">
                                    GODOY. Santiago
                                </label>
                            </div>
                        </td>

                        <td>15/11/2023 15:00 hs</td>
                        <td></td>
                        <td></td>

                    </tr>

                    <tr>
                        <td>
                            <div class="form-check">
                                <input class="form-check-input" type="radio" name="flexRadioDefault"
                                    id="flexRadioDefault1">
                                <label class="form-check-label" for="flexRadioDefault1">
                                    GODOY. Santiago
                                </label>
                            </div>
                        </td>
                        <td>15/11/2023 16:00 hs</td>
                        <td></td>
                        <td></td>
                    </tr>
                </tbody>
            </table>
        </div>

        <div class="row justify-content-end">

            <div class="col-1">
                <button type="submit" class="btn btn-success btn-sm">Guardar</button>
            </div>

            <div class="col-1">
                <button type="submit" class="btn btn-success btn-sm">Cancelar</button>
            </div>
        </div>
















        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
            integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
            crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.min.js"
            integrity="sha384-Rx+T1VzGupg4BHQYs2gCW9It+akI2MM/mndMCy36UVfodzcJcF0GGLxZIzObiEfa"
            crossorigin="anonymous"></script>
</body>

</html>