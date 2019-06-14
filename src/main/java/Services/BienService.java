package Services;

import java.util.*;
import Clases.*;
import Database.*;
import ClassHelper.*;

public class BienService extends Service, IBienService {
    public BienService(DBEntities db) : base(db)
    {
    }

    public BienService() : base()
    {
        
    }

    public Bien GetLastBien()
    {
        if (GetBienes().Count == 0)
            return new Bien();
        return db.Bienes.ToList().Last();
    }


    public override void Guardar(object obj)
    {
        var bien = (Bien)obj;
        bien.Codigo = GenerateCode(bien);
        db.Bienes.Add(bien);
        db.SaveChanges();
    }

    public Boolean YaExisteCodigo(String cod)
    {
        return db.Bienes.Where(o => o.Codigo == cod).FirstOrDefault() == null ? false : true;
    }

    public Bien FindBien(String patron)
    {
        var bien = db.Bienes.Where(o => o.Codigo.ToLower().Equals(patron) || 
                                    o.Nombre.ToLower().Equals(patron.ToLower())).FirstOrDefault();


        return bien;
    }

    public List<Bien> GetBienes()
    {
        return db.Bienes.ToList();
    }

    public Bien FindBien(int id)
    {
        return db.Bienes.Where(o => o.IdBien == id).FirstOrDefault();
    }

    public String GenerateCode(Bien bien)
    {
        int lastBien = GetLastBien().IdBien == 0 ? 1 : GetLastBien().IdBien + 1;
        String code = BienAttrInfo.GetRepresentacionValue(bien.Tipo).SubString(0, 3) + 
             "-"+ bien.Nombre.SubString(0,3)+"-"+(lastBien);
        return code;
    }
}