/*
    private String nombre;
    private String apellidos;
    private String identificacion;
    private int edad;
    private char sexo;
	private String facultad;
	private int cantidadCursosAsignados;

	CREATE TABLE public."Album" (
	    "AlbumId" integer NOT NULL,
	    "Title" character varying(160) NOT NULL,
	    "ArtistId" integer NOT NULL
	);
*/

CREATE TABLE public.estudiante (
    nombre	character varying(100) NOT NULL,
    apellidos	character varying(100) NOT NULL,
    identificacion	character varying(20) NOT NULL,
    edad	integer NOT NULL,
    sexo	character varying(1) NOT NULL,
	facultad	character varying(100),
	cantidad_cursos_asignados	integer 
);

DROP TABLE public.estudiante;

/*
ALTER TABLE ONLY public."Album"
    ADD CONSTRAINT "PK_Album" PRIMARY KEY ("AlbumId");
*/

ALTER TABLE public.estudiante
	ADD CONSTRAINT "pk_estudiante" 
		PRIMARY KEY (identificacion);

