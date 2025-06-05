SELECT *
FROM public."Artist"
WHERE "Name" = 'Queen';

SELECT *
FROM public."Artist"
WHERE "Name" <> 'Queen';

SELECT *
FROM public."Artist"
WHERE "Name" LIKE 'A%';

SELECT *
FROM public."Artist"
WHERE "Name" LIKE '%s';

SELECT *
FROM public."Artist"
WHERE "Name" LIKE 'The%';

SELECT *
FROM public."Artist"
WHERE "Name" LIKE '%mo%';

SELECT *
FROM public."Artist"
WHERE "Name" LIKE '%mO%';


SELECT *
FROM public."Artist"
WHERE "Name" LIKE '%he%A%';


SELECT *
FROM public."Customer"
WHERE "FirstName" LIKE 'E%';

SELECT *
FROM public."Customer"
WHERE "LastName" LIKE 'M%';


SELECT *
FROM public."Customer"
WHERE "FirstName" LIKE 'E%'
  AND "LastName" LIKE 'M%';


SELECT *
FROM public."Customer"
WHERE "FirstName" LIKE 'E%'
  OR "LastName" LIKE 'M%';


SELECT *
FROM public."Customer"
WHERE "FirstName" NOT LIKE 'E%';


SELECT *
FROM public."Artist"
WHERE "ArtistId" = 5; 


SELECT *
FROM public."Artist"
WHERE "ArtistId" <= 5; 


SELECT *
FROM public."Invoice"
WHERE "InvoiceDate" >= TO_DATE('01/01/2013', 'DD/MM/YYYY')
  AND "InvoiceDate" <= TO_DATE('31/12/2013', 'DD/MM/YYYY');


SELECT *
FROM public."Invoice"
WHERE "InvoiceDate" = TO_DATE('04/12/2013', 'DD/MM/YYYY');


SELECT *
FROM public."Invoice"
WHERE "InvoiceDate" = TO_DATE('2013-12-04', 'YYYY-MM-DD');


SELECT *
FROM public."Album";

--"Heart of the Night"

SELECT *
FROM public."Artist"
WHERE "ArtistId" = 53;


SELECT *
FROM public."Album" t1
INNER JOIN public."Artist" t2 
		ON (t1."ArtistId" = t2."ArtistId") 
WHERE "Title" = 'Heart of the Night';


SELECT t1."Title", t2."Name"
FROM public."Album" t1
INNER JOIN public."Artist" t2 
		ON (t1."ArtistId" = t2."ArtistId") 
WHERE "Title" = 'Heart of the Night';



SELECT t1."Title", t2."Name", t3.*
FROM public."Album" t1
INNER JOIN public."Artist" t2 
		ON (t1."ArtistId" = t2."ArtistId") 
INNER JOIN public."Track" t3
		ON (t1."AlbumId" = t3."AlbumId")
WHERE "Title" = 'Heart of the Night';



SELECT *
FROM public."Artist"
WHERE "Name" = 'Sabaton';

INSERT INTO public."Artist"("ArtistId", "Name")
VALUES (277, 'Sabaton');


INSERT INTO public."Album"("AlbumId", "Title", "ArtistId")
VALUES((SELECT MAX("AlbumId") + 1 FROM public."Album"),
	   'The Last Stand',
	   (SELECT "ArtistId" FROM public."Artist" WHERE "Name" = 'Sabaton'));
-- The Last Stand

SELECT MAX("AlbumId") + 1
FROM public."Album";

SELECT "ArtistId"
FROM public."Artist"
WHERE "Name" = 'Sabaton';


SELECT t1."Title", t2."Name"
FROM public."Album" t1
INNER JOIN public."Artist" t2 
		ON (t1."ArtistId" = t2."ArtistId") 
WHERE t2."Name" = 'Sabaton';
