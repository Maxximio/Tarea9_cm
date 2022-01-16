package ec.edu.uce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.Administrativo;
import ec.edu.uce.modelo.Autobus;
import ec.edu.uce.modelo.Colegio;
import ec.edu.uce.modelo.Escuela;
import ec.edu.uce.modelo.Estudiante;
import ec.edu.uce.modelo.Jardin;
import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.modelo.PersonalAdicional;
import ec.edu.uce.modelo.Prekinder;
import ec.edu.uce.modelo.Profesor;
import ec.edu.uce.modelo.Representante;
import ec.edu.uce.service.ColegioServiceImpl;
import ec.edu.uce.service.IAdministrativoService;
import ec.edu.uce.service.IAutobusService;
import ec.edu.uce.service.IColegioService;
import ec.edu.uce.service.IEscuelaService;
import ec.edu.uce.service.IEstudianteService;
import ec.edu.uce.service.IJardinService;
import ec.edu.uce.service.IPacienteService;
import ec.edu.uce.service.IPersonalAdicionalService;
import ec.edu.uce.service.IPrekinderService;
import ec.edu.uce.service.IProfesorService;
import ec.edu.uce.service.IRepresententeService;

@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	private IPacienteService pacienteServ;
	
	@Autowired
	private IAdministrativoService adminSrevice;
	
	@Autowired
	private IAutobusService autoService;
	
	@Autowired
	private IColegioService coleService;
	
	@Autowired
	private IEscuelaService escuService;
	
	@Autowired
	private IJardinService jardinService;
	
	@Autowired
	private IPersonalAdicionalService personalService;
	
	@Autowired
	private IPrekinderService preService;
	
	@Autowired
	private IProfesorService profeService;
	
	@Autowired
	private IRepresententeService repService;
	
	@Autowired
	private IEstudianteService estuService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		
		/*Paciente paciente1=new Paciente();
		paciente1.setId(3336);
		paciente1.setNombre("Carlos");
		paciente1.setApellido("Montalvo");
		paciente1.setEdad(22);
		
		pacienteServ.InsertarPacienteServicio(paciente1);*/
		
		Administrativo admin=new Administrativo();
		admin.setCi(2354);
		admin.setNombre("Juanita");
		admin.setApellido("Floress");
		admin.setFuncion("Asesoria");
		admin.setAniosServicio(8);
		
		//adminSrevice.InsertarPacienteServicio(admin);//////////////////
		System.out.println(adminSrevice.buscarPacienteServicio(2354));
		adminSrevice.actualizarPacienteServicio(admin);
		adminSrevice.borrarPacienteServicio(2354);
		
		Autobus auto=new Autobus();
		auto.setMatricula("pa1425");
		auto.setChofer("Mariano");
		auto.setRecorrido("zona 5");
		auto.setAniosServicio(7);
		auto.setAsientos(30);
		
		//autoService.InsertarAutobusServicio(auto);///////////////////
		System.out.println(autoService.buscarAutobusServicio("pa1425"));
		autoService.actualizarAutobusServicio(auto);
		autoService.borrarAutobusServicio("pa1425");
		
		Colegio cole=new Colegio();
		cole.setNombre("Colegio de Cotacachi");
		cole.setUbicacion("Cotacachi");
		cole.setNumEstudiantes(500);
		cole.setNumProfesores(32);
		cole.setTipo("Fiscal");
		
		//coleService.InsertarColegioServicio(cole);/////////////
		System.out.println(coleService.buscarAutobusServicio("Colegio de Cotacachi"));
		coleService.actualizarColegioServicio(cole);
		coleService.borrarColegioServicio("Colegio de Cotacachi");
		
		Escuela escu=new Escuela();
		escu.setNombre("Escuela y Salesiana");
		escu.setUbicacion("Cayambe");
		escu.setNumEstudiantes(2000);
		escu.setNumProfesores(77);
		escu.setTipo("Fiscomisional");
		
		//escuService.InsertarEscuelaServicio(escu);////////////
		System.out.println(escuService.buscarEscuelaServicio("Escuela y Salesiana"));
		escuService.actualizarEscuelaServicio(escu);
		escuService.borrarEscuelaServicio("Escuela y Salesiana");
		
		Jardin jardin=new Jardin();
		jardin.setNombre("Montessorii");
		jardin.setUbicacion("Quito");
		jardin.setNumEstudiantes(50);
		jardin.setNumProfesores(8);
		jardin.setTipo("Privado");
		
		//jardinService.InsertarJardinServicio(jardin);/////////////////
		System.out.println(jardinService.buscarJardinServicio("Montessorii"));
		jardinService.actualizarJardinServicio(jardin);
		jardinService.borrarJardinServicio("Montessorii");
		
		PersonalAdicional personal=new PersonalAdicional();
		personal.setId(234663356);
		personal.setNombre("Jorge");
		personal.setApellido("Ochoa");
		personal.setCargo("Conserje");
		personal.setAniosServicio(5);
		
		//personalService.InsertarPersonalAdicionalServicio(personal);/////////
		System.out.println(personalService.buscarPersonalAdicionalServicio(234663356));
		personalService.actualizarPersonalAdicionalServicio(personal);
		personalService.borrarPersonalAdicionalServicio(234663356);
		
		Prekinder pre=new Prekinder();
		pre.setNombre("Gatsu");
		pre.setUbicacion("Otavalo");
		pre.setNumEstudiantes(80);
		pre.setNumProfesores(10);
		pre.setTipo("Privado");
		
		//preService.InsertarPrekinderServicio(pre);/////////////////////
		System.out.println(preService.buscarPrekinderServicio("Gatsu"));
		preService.actualizarPrekinderServicio(pre);
		preService.borrarPrekinderServicio("Gatsu");
		
		Profesor profe=new Profesor();
		profe.setCi(25567568);
		profe.setNombre("Fernanda");
		profe.setApellido("Cruz");
		profe.setAsignatura("ingles");
		profe.setTitulo("Licenciad@");
		
		//profeService.InsertarProfesorServicio(profe);///////////////
		System.out.println(profeService.buscarProfesorServicio(25567568));
		profeService.actualizarProfesorServicio(profe);
		profeService.borrarProfesorServicio(25567568);
		
		Representante rep=new Representante();
		rep.setCi(53427565);
		rep.setNombre("Jaime");
		rep.setApellido("Campoverde");
		rep.setApoderado("Camila Paez");
		rep.setQuintil("Cuarto");
		
		//repService.InsertarRepresentanteServicio(rep);///////////
		System.out.println(repService.buscarRepresentanteServicio(53427565));
		repService.actualizarRepresentanteServicio(rep);
		repService.borrarRepresentanteServicio(53427565);
		
		Estudiante estu=new Estudiante();
		estu.setCi(123243456);
		estu.setNombre("Martin");
		estu.setApellido("Andrango");
		estu.setParalelo("B");
		estu.setGrado(9);
		
		//estuService.InsertarEstudianteServicio(estu);/////////////
		System.out.println(estuService.buscarEstudianteServicio(145676435));
		estuService.actualizarEstudianteServicio(estu);
		estuService.borrarEstudianteServicio(145676435);
	}

}
