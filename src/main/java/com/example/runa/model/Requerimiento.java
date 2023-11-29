package com.example.runa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


//@Entity
@Entity
public class Requerimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;
    private String VMO;
    private String solicitante;
    private String asignacion;
    private String requerimiento;
    private String cv;

    private String telefono;
    private String correo;
    private String dni;
    private String nombre;
    private String trabajo;
    private String disponibilidad;
    private String antecedentes;
    private String trabajoHits;
    private String familiaresHits;
    private String trabajoVinculado;
    private String pasoTrabajoVinculado;
    private String fuente;
    private String fechaNacimiento;
    private String todosTelefonos;
    private String puesto;
    private String empleador_;
    private String institucion_;
    private String carreras;
    private String grados;
    private String salario;
    private String espectativa;
    private String beneficio;
    private String puestoHits;
    private String pregunta1;
    private String pregunta2;
    private String pregunta3;
    private String pregunta4;
    private String nombre_puesto;

    private String adjunto1;
    private String adjunto2;
    private String adjunto3;
    private String adjunto4;

    private String antecedentesA;
    private String antecedentesB;
    private String antecedentePolicial;
    private String antecedentePenal;
    private String antecedenteJudicial;
    private String certiAdulto;
    private String multiTest;
    private String informePsicologico;
    private String fichaDatos;
    private String fichaMedica;
    private String fichaRequerimiento;
    private String fichaAprobacion;
    private String otrosAdjuntos;

    public String getAdjunto1() {
        return adjunto1;
    }

    public void setAdjunto1(String adjunto1) {
        this.adjunto1 = adjunto1;
    }

    public String getAdjunto2() {
        return adjunto2;
    }

    public void setAdjunto2(String adjunto2) {
        this.adjunto2 = adjunto2;
    }

    public String getAdjunto3() {
        return adjunto3;
    }

    public void setAdjunto3(String adjunto3) {
        this.adjunto3 = adjunto3;
    }

    public String getAdjunto4() {
        return adjunto4;
    }

    public void setAdjunto4(String adjunto4) {
        this.adjunto4 = adjunto4;
    }

    public String getNombre_puesto() {
        return nombre_puesto;
    }

    public void setNombre_puesto(String nombre_puesto) {
        this.nombre_puesto = nombre_puesto;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public String getVMO() {
        return VMO;
    }

    public void setVMO(String VMO) {
        this.VMO = VMO;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public String getAsignacion() {
        return asignacion;
    }

    public String getRequerimiento() {
        return requerimiento;
    }

    public void setRequerimiento(String requerimiento) {
        this.requerimiento = requerimiento;
    }

    public void setAsignacion(String asignacion) {
        this.asignacion = asignacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(String antecedentes) {
        this.antecedentes = antecedentes;
    }

    public String getTrabajoHits() {
        return trabajoHits;
    }

    public void setTrabajoHits(String trabajoHits) {
        this.trabajoHits = trabajoHits;
    }

    public String getFamiliaresHits() {
        return familiaresHits;
    }

    public void setFamiliaresHits(String familiaresHits) {
        this.familiaresHits = familiaresHits;
    }

    public String getTrabajoVinculado() {
        return trabajoVinculado;
    }

    public void setTrabajoVinculado(String trabajoVinculado) {
        this.trabajoVinculado = trabajoVinculado;
    }

    public String getPasoTrabajoVinculado() {
        return pasoTrabajoVinculado;
    }

    public void setPasoTrabajoVinculado(String pasoTrabajoVinculado) {
        this.pasoTrabajoVinculado = pasoTrabajoVinculado;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTodosTelefonos() {
        return todosTelefonos;
    }

    public void setTodosTelefonos(String todosTelefonos) {
        this.todosTelefonos = todosTelefonos;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getEmpleador_() {
        return empleador_;
    }

    public void setEmpleador_(String empleador_) {
        this.empleador_ = empleador_;
    }

    public String getInstitucion_() {
        return institucion_;
    }

    public void setInstitucion_(String institucion_) {
        this.institucion_ = institucion_;
    }

    public String getCarreras() {
        return carreras;
    }

    public void setCarreras(String carreras) {
        this.carreras = carreras;
    }

    public String getGrados() {
        return grados;
    }

    public void setGrados(String grados) {
        this.grados = grados;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getEspectativa() {
        return espectativa;
    }

    public void setEspectativa(String espectativa) {
        this.espectativa = espectativa;
    }

    public String getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(String beneficio) {
        this.beneficio = beneficio;
    }

    public String getPuestoHits() {
        return puestoHits;
    }

    public void setPuestoHits(String puestoHits) {
        this.puestoHits = puestoHits;
    }

    public String getPregunta1() {
        return pregunta1;
    }

    public void setPregunta1(String pregunta1) {
        this.pregunta1 = pregunta1;
    }

    public String getPregunta2() {
        return pregunta2;
    }

    public void setPregunta2(String pregunta2) {
        this.pregunta2 = pregunta2;
    }

    public String getPregunta3() {
        return pregunta3;
    }

    public void setPregunta3(String pregunta3) {
        this.pregunta3 = pregunta3;
    }

    public String getPregunta4() {
        return pregunta4;
    }

    public void setPregunta4(String pregunta4) {
        this.pregunta4 = pregunta4;
    }

    public String getAntecedentesA() {
        return antecedentesA;
    }

    public void setAntecedentesA(String antecedentesA) {
        this.antecedentesA = antecedentesA;
    }

    public String getAntecedentesB() {
        return antecedentesB;
    }

    public void setAntecedentesB(String antecedentesB) {
        this.antecedentesB = antecedentesB;
    }

    public String getAntecedentePolicial() {
        return antecedentePolicial;
    }

    public void setAntecedentePolicial(String antecedentePolicial) {
        this.antecedentePolicial = antecedentePolicial;
    }

    public String getAntecedentePenal() {
        return antecedentePenal;
    }

    public void setAntecedentePenal(String antecedentePenal) {
        this.antecedentePenal = antecedentePenal;
    }

    public String getAntecedenteJudicial() {
        return antecedenteJudicial;
    }

    public void setAntecedenteJudicial(String antecedenteJudicial) {
        this.antecedenteJudicial = antecedenteJudicial;
    }

    public String getCertiAdulto() {
        return certiAdulto;
    }

    public void setCertiAdulto(String certiAdulto) {
        this.certiAdulto = certiAdulto;
    }

    public String getMultiTest() {
        return multiTest;
    }

    public void setMultiTest(String multiTest) {
        this.multiTest = multiTest;
    }

    public String getInformePsicologico() {
        return informePsicologico;
    }

    public void setInformePsicologico(String informePsicologico) {
        this.informePsicologico = informePsicologico;
    }

    public String getFichaDatos() {
        return fichaDatos;
    }

    public void setFichaDatos(String fichaDatos) {
        this.fichaDatos = fichaDatos;
    }

    public String getFichaMedica() {
        return fichaMedica;
    }

    public void setFichaMedica(String fichaMedica) {
        this.fichaMedica = fichaMedica;
    }

    public String getFichaRequerimiento() {
        return fichaRequerimiento;
    }

    public void setFichaRequerimiento(String fichaRequerimiento) {
        this.fichaRequerimiento = fichaRequerimiento;
    }


    public String getOtrosAdjuntos() {
        return otrosAdjuntos;
    }

    public void setOtrosAdjuntos(String otrosAdjuntos) {
        this.otrosAdjuntos = otrosAdjuntos;
    }

    public String getFichaAprobacion() {
        return fichaAprobacion;
    }

    public void setFichaAprobacion(String fichaAprobacion) {
        this.fichaAprobacion = fichaAprobacion;
    }
}
