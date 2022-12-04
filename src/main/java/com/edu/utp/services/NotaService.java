package com.edu.utp.services;

import java.util.Set;

import com.edu.utp.models.Nota;

public interface NotaService {
    Nota agregarNota(Nota nota);
    Nota actualizarNota(Nota nota);
    Nota obtenerNota(Long notaId);
    Set<Nota> obtenerNotas();
}
