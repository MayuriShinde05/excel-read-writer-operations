### Utility
To get the input in the applications.properties file and read Excel one-by-one record processing, and once the execution is complete, it's time to write the response in an Excel file.
All are configured, like the input file path, output file path, number of sheets, etc.

### Steps: 
1) Take code from TFS but use a git clone: https://tfshub.crifnet.com:8443/CRIF/CreditFlow_Delivery/_git/globe-excel-utility
2) Build projects with Maven.
3) Set the applications.properties for application. It is present inside the "/src/main/resources/" folder.
4) Start the application.


### Execution utility with 5K records
1) We already added a few properties to the applications.properties file.   Please update the path.
    For e.g.,
        # This is the input file path.
        com.crif.globe.s1path=F:\\mysetup\\5kRecords.xlsx

        # This is the output file path.
        com.crif.globe.s1responseFile=F:\\mysetup\\Globe_UAT_S1_Response.xlsx

2) We added Rest API (/secured) in this code with Postman collection in this "/src/main/resources/" location.

3) Once the application starts, please execute port 9091 as per the application. properties file.


### NOTE: 
#### This execution happened one by one until the s1 response came. The one-by-one records create the s1 request, execute the s1 API, get the response, 
#### and store it in the cache variable until the 5K records execution is not able to complete. 
#### Once the S1 request/response execution was done, the writing of the S1 response into the Excel file code execution started.
 
