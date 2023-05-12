-- CRIAR TABELA
CREATE TABLE IF NOT EXISTS public.pessoas
(
    id serial NOT NULL,
    nome character varying(100) NOT NULL,
    data_nascimento date NOT NULL,
    PRIMARY KEY (id)
)

-- INSERIR REGISTROS

INSERT INTO public.pessoas(
	id, nome, data_nascimento)
	VALUES (NULL, 'Amarildo Miguel', '1999-02-24');

