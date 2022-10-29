WinWaitActive("Open");
ControlFocus("Open","","Edit1");
Sleep(3000);
Send($CmdLine[1]);
ControlClick("Open","&Open","Button1");