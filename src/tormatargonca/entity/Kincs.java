package tormatargonca.entity;

public class Kincs {

    private int _id;
    private String _nev;
    private String _leiras;

    public Kincs(int id, String nev, String leiras) {
        this._id = id;
        this._nev = nev;
        this._leiras = leiras;
    }

    // <editor-fold defaultstate="collapsed" desc=" get, set metódusok ">
    /**
     * @return the _id
     */
    public int getId() {
        return _id;
    }

    /**
     * @param _id the _id to set
     */
    public void setId(int _id) {
        this._id = _id;
    }

    /**
     * @return the _nev
     */
    public String getNev() {
        return _nev;
    }

    /**
     * @param _nev the _nev to set
     */
    public void setNev(String _nev) {
        this._nev = _nev;
    }

    /**
     * @return the _leiras
     */
    public String getLeiras() {
        return _leiras;
    }

    /**
     * @param _leiras the _leiras to set
     */
    public void setLeiras(String _leiras) {
        this._leiras = _leiras;
    }
    // </editor-fold>
}
