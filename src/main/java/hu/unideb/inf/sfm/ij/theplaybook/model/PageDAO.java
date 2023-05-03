package hu.unideb.inf.sfm.ij.theplaybook.model;

import java.util.List;

public interface PageDAO {

    List<Page> getPages();

    void savePage(Page page);

    void updatePage(Page page);

    Page getPage(int id);

    void removePage(Page page);
}
