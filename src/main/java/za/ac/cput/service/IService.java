package za.ac.cput.service;

public interface IService <entityType, datatypeOfID> {
    entityType create (entityType t);
    entityType read (datatypeOfID id);
    entityType update (entityType t);
    boolean delete (datatypeOfID id);
}
