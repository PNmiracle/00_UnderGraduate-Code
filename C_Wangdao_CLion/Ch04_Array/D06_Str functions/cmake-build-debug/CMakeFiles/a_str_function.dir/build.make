# CMAKE generated file: DO NOT EDIT!
# Generated by "MinGW Makefiles" Generator, CMake Version 3.20

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:

#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:

# Disable VCS-based implicit rules.
% : %,v

# Disable VCS-based implicit rules.
% : RCS/%

# Disable VCS-based implicit rules.
% : RCS/%,v

# Disable VCS-based implicit rules.
% : SCCS/s.%

# Disable VCS-based implicit rules.
% : s.%

.SUFFIXES: .hpux_make_needs_suffix_list

# Command-line flag to silence nested $(MAKE).
$(VERBOSE)MAKESILENT = -s

#Suppress display of executed commands.
$(VERBOSE).SILENT:

# A target that is always out of date.
cmake_force:
.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

SHELL = cmd.exe

# The CMake executable.
CMAKE_COMMAND = "E:\CLion\CLion 2021.2.3\bin\cmake\win\bin\cmake.exe"

# The command to remove a file.
RM = "E:\CLion\CLion 2021.2.3\bin\cmake\win\bin\cmake.exe" -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = "D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\Ch04_Array\D06_Str functions"

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = "D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\Ch04_Array\D06_Str functions\cmake-build-debug"

# Include any dependencies generated for this target.
include CMakeFiles/a_str_function.dir/depend.make
# Include the progress variables for this target.
include CMakeFiles/a_str_function.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/a_str_function.dir/flags.make

CMakeFiles/a_str_function.dir/ch05_pointer/a_str_function.c.obj: CMakeFiles/a_str_function.dir/flags.make
CMakeFiles/a_str_function.dir/ch05_pointer/a_str_function.c.obj: ../ch05_pointer/a_str_function.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\Ch04_Array\D06_Str functions\cmake-build-debug\CMakeFiles" --progress-num=$(CMAKE_PROGRESS_1) "Building C object CMakeFiles/a_str_function.dir/ch05_pointer/a_str_function.c.obj"
	D:\adeveloperTools\MinGW\MinGW\MinGW\bin\gcc.exe $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles\a_str_function.dir\ch05_pointer\a_str_function.c.obj -c "D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\Ch04_Array\D06_Str functions\ch05_pointer\a_str_function.c"

CMakeFiles/a_str_function.dir/ch05_pointer/a_str_function.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/a_str_function.dir/ch05_pointer/a_str_function.c.i"
	D:\adeveloperTools\MinGW\MinGW\MinGW\bin\gcc.exe $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E "D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\Ch04_Array\D06_Str functions\ch05_pointer\a_str_function.c" > CMakeFiles\a_str_function.dir\ch05_pointer\a_str_function.c.i

CMakeFiles/a_str_function.dir/ch05_pointer/a_str_function.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/a_str_function.dir/ch05_pointer/a_str_function.c.s"
	D:\adeveloperTools\MinGW\MinGW\MinGW\bin\gcc.exe $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S "D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\Ch04_Array\D06_Str functions\ch05_pointer\a_str_function.c" -o CMakeFiles\a_str_function.dir\ch05_pointer\a_str_function.c.s

# Object files for target a_str_function
a_str_function_OBJECTS = \
"CMakeFiles/a_str_function.dir/ch05_pointer/a_str_function.c.obj"

# External object files for target a_str_function
a_str_function_EXTERNAL_OBJECTS =

a_str_function.exe: CMakeFiles/a_str_function.dir/ch05_pointer/a_str_function.c.obj
a_str_function.exe: CMakeFiles/a_str_function.dir/build.make
a_str_function.exe: CMakeFiles/a_str_function.dir/linklibs.rsp
a_str_function.exe: CMakeFiles/a_str_function.dir/objects1.rsp
a_str_function.exe: CMakeFiles/a_str_function.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir="D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\Ch04_Array\D06_Str functions\cmake-build-debug\CMakeFiles" --progress-num=$(CMAKE_PROGRESS_2) "Linking C executable a_str_function.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\a_str_function.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/a_str_function.dir/build: a_str_function.exe
.PHONY : CMakeFiles/a_str_function.dir/build

CMakeFiles/a_str_function.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\a_str_function.dir\cmake_clean.cmake
.PHONY : CMakeFiles/a_str_function.dir/clean

CMakeFiles/a_str_function.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" "D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\Ch04_Array\D06_Str functions" "D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\Ch04_Array\D06_Str functions" "D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\Ch04_Array\D06_Str functions\cmake-build-debug" "D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\Ch04_Array\D06_Str functions\cmake-build-debug" "D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\Ch04_Array\D06_Str functions\cmake-build-debug\CMakeFiles\a_str_function.dir\DependInfo.cmake" --color=$(COLOR)
.PHONY : CMakeFiles/a_str_function.dir/depend

