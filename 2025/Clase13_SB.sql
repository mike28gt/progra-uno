SELECT *
FROM public."Customer";

SELECT *
FROM public."Customer"
WHERE "CustomerId" = 38;

UPDATE public."Customer"
SET "Company" = 'Meta'
WHERE "CustomerId" = 38;


UPDATE public."Customer"
SET "LastName" = 'Schroder',
	"Address"= 'Barbarossastre e 19'
WHERE "CustomerId" = 38;


SELECT *
FROM public."Artist"
WHERE "ArtistId" = 276;

SELECT *
FROM public."Album"
WHERE "ArtistId" = 276;


DELETE FROM public."Album"
WHERE "ArtistId" = 276;

DELETE FROM public."Artist"
WHERE "ArtistId" = 276;


INSERT INTO public."Album"("AlbumId", "Title", "ArtistId")
VALUES (500, NULL, 100);




