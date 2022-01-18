import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrganizationTest {

    @Test
    void deveRetornarLutadores() {
        Organization organization = new Organization();

        organization.contratar("José Aldo", "Peso-Pena", 64.3f);
        organization.contratar("Anderson Silva", "Peso-Médio", 82.3f);
        organization.contratar("Fabricio Werdum", "Peso-Pesado", 110.7f);

        List<String> exibir = Arrays.asList(
                "Lutador{Nome='José Aldo', Peso='64.3 kg', Categoria='Peso-Pena'}",
                "Lutador{Nome='Anderson Silva', Peso='82.3 kg', Categoria='Peso-Médio'}",
                "Lutador{Nome='Fabricio Werdum', Peso='110.7 kg', Categoria='Peso-Pesado'}"
        );

        assertEquals(exibir, organization.obterFuncionarios());
    }

    @Test
    void deveRetornarTotalCategorias() {
        Organization organization = new Organization();

        organization.contratar("Deiverson Figuereido", "Peso-Mosca", 55.7f);
        organization.contratar("Renan Barão", "Peso-Galo", 60.4f);
        organization.contratar("José Aldo", "Peso-Pena", 64.3f);
        organization.contratar("Charles Oliveira", "Peso-Leve", 70.3f);
        organization.contratar("Anderson Silva", "Peso-Médio", 82.3f);
        organization.contratar("Fabricio Werdum", "Peso-Pesado", 110.7f);
        organization.contratar("Junior Cigano dos Santos", "Peso-Pesado", 113.7f);

        assertEquals(6, WeightFactory.getTotalCargos());
    }
}