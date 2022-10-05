package com.joel.Webserver;

import java.util.List;

public interface UserService {
    List<User>listado();
    User filtradoId(int id);
    User agregar(User u);
    User editar(User u);
    User eliminar(int id);
}
