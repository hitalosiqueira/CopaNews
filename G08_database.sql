--
-- PostgreSQL database dump
--

SET statement_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- Name: postgres; Type: COMMENT; Schema: -; Owner: postgres
--

COMMENT ON DATABASE postgres IS 'default administrative connection database';


--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: campeonato; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE campeonato (
    nome character varying(500) NOT NULL
);


ALTER TABLE public.campeonato OWNER TO postgres;

--
-- Name: cidade; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE cidade (
    id integer NOT NULL,
    nome character varying(500) NOT NULL,
    pais character varying(500),
    populacao character varying(500),
    latitude character varying(500),
    longitude character varying(500)
);


ALTER TABLE public.cidade OWNER TO postgres;

--
-- Name: cidade_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE cidade_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.cidade_id_seq OWNER TO postgres;

--
-- Name: cidade_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE cidade_id_seq OWNED BY cidade.id;


--
-- Name: esporte; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE esporte (
    nome character varying(500) NOT NULL
);


ALTER TABLE public.esporte OWNER TO postgres;

--
-- Name: estadio; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE estadio (
    nome character varying(500) NOT NULL,
    cidade character varying(500),
    capacidade character varying(20),
    uso character varying(500),
    construidoem character varying(4),
    cadeiras character varying(15)
);


ALTER TABLE public.estadio OWNER TO postgres;

--
-- Name: jogador; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE jogador (
    id_jogador integer NOT NULL,
    nome character varying(500),
    sobrenome character varying(500),
    apelido character varying(500),
    datanasc_ano integer,
    datanasc_mes integer,
    datanasc_dia integer,
    datanasc_cidade integer,
    aposentado integer,
    aposenta_data character varying(12),
    altura character varying(6),
    peso character varying(6),
    CONSTRAINT jogador_aposentado_check CHECK ((aposentado = ANY (ARRAY[0, 1])))
);


ALTER TABLE public.jogador OWNER TO postgres;

--
-- Name: jogador_id_jogador_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE jogador_id_jogador_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.jogador_id_jogador_seq OWNER TO postgres;

--
-- Name: jogador_id_jogador_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE jogador_id_jogador_seq OWNED BY jogador.id_jogador;


--
-- Name: jogador_time; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE jogador_time (
    jogador integer NOT NULL,
    "time" character varying(500) NOT NULL,
    data_inicio integer NOT NULL,
    data_fim integer,
    salario integer
);


ALTER TABLE public.jogador_time OWNER TO postgres;

--
-- Name: jogo; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE jogo (
    time_1 character varying(500) NOT NULL,
    time_2 character varying(500),
    data character varying(12) NOT NULL,
    horainicio character varying(4),
    estadio character varying(500),
    vencedor integer,
    campeonato character varying(500)
);


ALTER TABLE public.jogo OWNER TO postgres;

--
-- Name: manager; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE manager (
    id_manager integer,
    nome character varying(500),
    sobrenome character varying(500),
    apelido character varying(500),
    datanasc_ano character varying(4),
    datanasc_mes character varying(4),
    datanasc_dia character varying(4),
    datanasc_cidade integer,
    aposentado integer,
    aposenta_data character varying(12)
);


ALTER TABLE public.manager OWNER TO postgres;

--
-- Name: manager_time; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE manager_time (
    manager integer NOT NULL,
    "time" character varying(500) NOT NULL,
    data_inicio integer NOT NULL,
    data_fim character varying(4),
    salario integer
);


ALTER TABLE public.manager_time OWNER TO postgres;

--
-- Name: pais; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pais (
    nome character varying(500),
    sigla2letras character varying(2) NOT NULL,
    sigla3letras character varying(3),
    ddi integer
);


ALTER TABLE public.pais OWNER TO postgres;

--
-- Name: time; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE "time" (
    nome character varying(500) NOT NULL,
    esporte character varying(500),
    estadio character varying(500)
);


ALTER TABLE public."time" OWNER TO postgres;

--
-- Name: id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY cidade ALTER COLUMN id SET DEFAULT nextval('cidade_id_seq'::regclass);


--
-- Name: id_jogador; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY jogador ALTER COLUMN id_jogador SET DEFAULT nextval('jogador_id_jogador_seq'::regclass);


--
-- Name: campeonato_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY campeonato
    ADD CONSTRAINT campeonato_pkey PRIMARY KEY (nome);


--
-- Name: cidade_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY cidade
    ADD CONSTRAINT cidade_pkey PRIMARY KEY (id);


--
-- Name: esporte_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY esporte
    ADD CONSTRAINT esporte_pkey PRIMARY KEY (nome);


--
-- Name: estadiotmp_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY estadio
    ADD CONSTRAINT estadiotmp_pkey PRIMARY KEY (nome);


--
-- Name: jogador_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY jogador
    ADD CONSTRAINT jogador_pkey PRIMARY KEY (id_jogador);


--
-- Name: jogador_time_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY jogador_time
    ADD CONSTRAINT jogador_time_pkey PRIMARY KEY (jogador, "time", data_inicio);


--
-- Name: jogo_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY jogo
    ADD CONSTRAINT jogo_pkey PRIMARY KEY (time_1, data);


--
-- Name: manager_time_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY manager_time
    ADD CONSTRAINT manager_time_pkey PRIMARY KEY (manager, "time", data_inicio);


--
-- Name: pais_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pais
    ADD CONSTRAINT pais_pkey PRIMARY KEY (sigla2letras);


--
-- Name: time_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY "time"
    ADD CONSTRAINT time_pkey PRIMARY KEY (nome);


--
-- Name: fk_pais; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY cidade
    ADD CONSTRAINT fk_pais FOREIGN KEY (pais) REFERENCES pais(sigla2letras);


--
-- Name: jogador_datanasc_cidade_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY jogador
    ADD CONSTRAINT jogador_datanasc_cidade_fkey FOREIGN KEY (datanasc_cidade) REFERENCES cidade(id);


--
-- Name: jogador_time_jogador_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY jogador_time
    ADD CONSTRAINT jogador_time_jogador_fkey FOREIGN KEY (jogador) REFERENCES jogador(id_jogador);


--
-- Name: jogo_campeonato_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY jogo
    ADD CONSTRAINT jogo_campeonato_fkey FOREIGN KEY (campeonato) REFERENCES campeonato(nome);


--
-- Name: jogo_time1_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY jogo
    ADD CONSTRAINT jogo_time1_fkey FOREIGN KEY (time_1) REFERENCES "time"(nome);


--
-- Name: jogo_time2_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY jogo
    ADD CONSTRAINT jogo_time2_fkey FOREIGN KEY (time_2) REFERENCES "time"(nome);


--
-- Name: jogtime_time_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY jogador_time
    ADD CONSTRAINT jogtime_time_fkey FOREIGN KEY ("time") REFERENCES "time"(nome) ON UPDATE CASCADE ON DELETE SET NULL;


--
-- Name: mantime_time_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY manager_time
    ADD CONSTRAINT mantime_time_fkey FOREIGN KEY ("time") REFERENCES "time"(nome);


--
-- Name: time_esporte_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY "time"
    ADD CONSTRAINT time_esporte_fkey FOREIGN KEY (esporte) REFERENCES esporte(nome);


--
-- Name: time_estadio_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY "time"
    ADD CONSTRAINT time_estadio_fkey FOREIGN KEY (estadio) REFERENCES estadio(nome) ON UPDATE CASCADE ON DELETE SET NULL;


--
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


--
-- PostgreSQL database dump complete
--
