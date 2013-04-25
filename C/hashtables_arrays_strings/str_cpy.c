/**
* assuming dest has enough memory for src
**/
void str_cpy(char *dest, const char* src){
	while(*dest++=*src++);
}

/**
* USAGE: ./a.out string1 3  [To copy first 3 chars of string1]
**/
int main(int argc, char *argv[]){
	if(argc<2) return EXIT_FAILURE;
	char* result = malloc(argv[2]*sizeof(char));
	str_cpy(result,argv[1])
	printf("%s",result);
	return EXIT_SUCCESS;
}