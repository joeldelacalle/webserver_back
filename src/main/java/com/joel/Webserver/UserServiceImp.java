package com.joel.Webserver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserRepositorio repositorio;

    @Override
    public List<User> listado() {
        return repositorio.findAll();
    }

    @Override
    public User filtradoId(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User agregar(User u) {
        // TODO Auto-generated method stub
        return repositorio.save(u);
    }

    @Override
    public User editar(User u) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User eliminar(int id) {
        // TODO Auto-generated method stub
        return null;
    }
    
}