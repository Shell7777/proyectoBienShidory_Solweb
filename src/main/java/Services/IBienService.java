package Services;
import java.util.*;
import Clases.*;

public interface IBienService extends IService{

    Bien GetLastBien();
    Boolean YaExisteCodigo(String cod);
    Bien FindBien(String patron);
    Bien FindBien(int id);
    List<Bien> GetBienes();
    String GenerateCode(Bien bien);
}