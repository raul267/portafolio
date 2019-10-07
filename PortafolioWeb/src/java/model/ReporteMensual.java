package model;
import java.sql.Date;

/*


Como reportes, la empresa emite mensualmente resultados de la gestiÃ³n para cada cliente,
 incluyendo todas las visitas,
 las capacitaciones,
 las asesorÃ­as,
 los llamados,
 las nuevas implementaciones,
 los accidentes,
 las multas, etc.

 AdemÃ¡s internamente se generan indicadores de rendimiento de cada profesional,
 relacionados con cantidad de capacitaciones versus la cantidad de accidentes de los asistentes,
 entre otros, y de los resultados de accidentabilidad en las empresas clientes.

*/

public class ReporteMensual{

	private int id;
	private Date fechaReporte;
        private String descripcion;

}