package ca.nait.dmit.domain;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class AlbertaCovid19CaseManagerTest {
    AlbertaCovid19CaseManager caseManager;
    @BeforeEach
    void beforeEach() throws IOException{
        caseManager = AlbertaCovid19CaseManager.getInstance();
    }
    @Test
    void getAlbertaCovid19CaseList() throws IOException {
//        AlbertaCovid19CaseManager caseManager = new AlbertaCovid19CaseManager();

        assertEquals(436495, caseManager.getAlbertaCovid19CaseList().size());
    }
    @Test
    void activeCases() throws IOException {
        //AlbertaCovid19CaseManager caseManager = AlbertaCovid19CaseManager.getInstance();
        assertEquals(64_129, caseManager.countTotalActiveCases());
    }
    @Test
    void activeCasesByZone() throws IOException {
        assertEquals(29_544, caseManager.countActiveCasesByAHSZone("Calgary Zone"));
        assertEquals(24_062, caseManager.countActiveCasesByAHSZone("Edmonton Zone"));
    }
    @Test
    void distinctAhsZones() {
        List<String> ahsZoneList = caseManager.distinctAhsZones(); //List can be also be referred as a sequence.
        ahsZoneList.forEach(System.out::println);
        assertEquals(6, ahsZoneList.size());
    }

}