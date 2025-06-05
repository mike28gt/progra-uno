SELECT "ArtistId", "Name"
FROM public."Artist";

SELECT *
FROM public."Artist";

SELECT *
FROM public."Artist"
WHERE "Name" = 'Jimi Hendrix';

SELECT *
FROM public."Artist"
WHERE "Name" = 'Kanye West';

SELECT *
FROM public."Artist"
WHERE "Name" LIKE 'a%';

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
FROM public."Customer"
WHERE "FirstName" LIKE 'E%'
  AND "LastName" LIKE 'M%';

SELECT *
FROM public."Customer"
WHERE "FirstName" LIKE 'E%'
   OR "LastName" LIKE 'M%';

SELECT *
FROM public."Customer"
WHERE "FirstName" NOT LIKE 'E%'
   AND "LastName" NOT LIKE 'M%';

SELECT *
FROM public."Customer"
WHERE "CustomerId" = 22;

SELECT *
FROM public."Customer"
WHERE "CustomerId" <> 22;


SELECT *
FROM public."Invoice"
WHERE "InvoiceDate" >= TO_DATE('01/01/2013', 'DD/MM/YYYY')
  AND "InvoiceDate" <= TO_DATE('31/12/2013', 'DD/MM/YYYY');


SELECT *
FROM public."Invoice"
WHERE "InvoiceDate" = TO_DATE('2013-12-04', 'YYYY-MM-DD');


SELECT *
FROM public."Album";

SELECT *
FROM public."Artist"
WHERE "ArtistId" = 3;


SELECT *
FROM public."Album" t1
INNER JOIN public."Artist" t2 
		ON (t1."ArtistId" = t2."ArtistId")
WHERE "Title" = 'Big Ones';


SELECT t1."Title", t2."Name"
FROM public."Album" t1
INNER JOIN public."Artist" t2 
		ON (t1."ArtistId" = t2."ArtistId")
WHERE "Title" = 'Big Ones';


SELECT t1."Title", t2."Name", t3."Name"
FROM public."Album" t1
INNER JOIN public."Artist" t2 
		ON (t1."ArtistId" = t2."ArtistId")
INNER JOIN public."Track" t3
		ON (t1."AlbumId" = t3."AlbumId")
WHERE "Title" = 'Big Ones';


INSERT INTO public."Artist"("ArtistId", "Name")
VALUES (276, 'Kanye West');

INSERT INTO public."Album"("AlbumId", "Title", "ArtistId")
VALUES ((SELECT MAX("AlbumId") + 1 FROM "Album"),
		'Bully',
		(SELECT "ArtistId" FROM "Artist" WHERE "Name" = 'Kanye West'));

SELECT MAX("AlbumId") + 1
FROM "Album";

SELECT "ArtistId"
FROM "Artist"
WHERE "Name" = 'Kanye West';



SELECT t1."Title", t2."Name"
FROM public."Album" t1
INNER JOIN public."Artist" t2 
		ON (t1."ArtistId" = t2."ArtistId")
WHERE "Title" = 'Bully';
