
package com.edinsonmillan.interfaces;

import com.edinsonmillan.entidad.*;
import java.util.List;

public interface SalidaInventarioInterface {

    SalidaInventario realizarSalidaInventario(SalidaInventario salidaInventario);
    SalidaInventario buscarSalidaInventario(int idSalida);
    List<SalidaInventario> obtenerTodasLasSalidas();
    List<SalidaInventario> buscarSalidasPorFecha(String fechaInicio, String fechaFin);
 
}
