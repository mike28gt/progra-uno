select *
from public."Customer"
where "CustomerId" = 2;


UPDATE public."Customer"
SET "Company" = 'Google'
WHERE "CustomerId" = 2;


UPDATE public."Customer"
SET "LastName" = 'Kohler',
	"Address" = 'Theodor-Heuss-Strasse 34'
WHERE "CustomerId" = 2;

SELECT *
FROM public."Artist";


SELECT *
FROM public."Album"
WHERE "ArtistId" = 277;


DELETE FROM public."Album"
WHERE "ArtistId" = 277;

DELETE FROM public."Artist"
WHERE "ArtistId" = 277;


INSERT INTO public."Album"("AlbumId", "Title", "ArtistId")
VALUES (500, NULL, 100);

