package Database;

import java.util.*;
import Clases.*;

public class DBEntities extends DbContext {

    public IDbSet<Bien> Bienes;
    public IDbSet<Movimiento> Movimientos;
    public IDbSet<Usuario> Usuarios;
    
    protected override void OnModelCreating(DbModelBuilder modelBuilder)
    {
        base.OnModelCreating(modelBuilder);


    }
}
