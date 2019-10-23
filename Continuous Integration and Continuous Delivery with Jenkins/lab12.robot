*** Settings ***
Library    SeleniumLibrary

*** Variables ***
${HOMEPAGE}    https://google.co.th
${BROWSER}    chrome

*** Test Cases ***
Go To homepage
    Open Browser    ${HOMEPAGE}    ${BROWSER}