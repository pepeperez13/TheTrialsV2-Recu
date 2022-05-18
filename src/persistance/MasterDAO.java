package persistance;

import business.typeTrials.MasterStudies;

import java.io.IOException;
import java.util.LinkedList;

public interface MasterDAO {
    boolean create(MasterStudies masterStudies);

    LinkedList<MasterStudies> readAll();

    MasterStudies findByIndex(int index);

    boolean delete(int index);

    boolean changeLine(int index, MasterStudies masterStudies);


}
