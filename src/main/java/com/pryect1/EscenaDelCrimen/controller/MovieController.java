package com.pryect1.EscenaDelCrimen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MovieController {
    /*
    <Route path="/avisos-legales" element={<AvisosLegales />} />
          <Route path="/terminos-uso" element={<TerminosUso />} />
          <Route path="/sobre-nosotros" element={<SobreNosotros />} />
          <Route path="/politicas-de-privacidad" element={<PoliticasPrivacidad />} />
          <Route path="/catalog" element={<Catalog />} />
          <Route path="/addMoviesPage" element={<AddFilmPage />} />
          <Route path="/ubicacion" element={<UbicationPage />} />
          <Route path="/admin" element={<Formulario />} />
     */
    @GetMapping("/")
    public String getHome(){
        return "home";
    }
    @GetMapping("/avisosLegales")
    public String avisosLegales(){
        return "avisosLegales";
    }
}
