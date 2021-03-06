USE [master]
GO
/****** Object:  Database [ManagementStudent]    Script Date: 11/10/2019 11:19:07 AM ******/
CREATE DATABASE [ManagementStudent]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'ManagementStudent', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.SQLEXPRESS\MSSQL\DATA\ManagementStudent.mdf' , SIZE = 3136KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'ManagementStudent_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.SQLEXPRESS\MSSQL\DATA\ManagementStudent_log.ldf' , SIZE = 784KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [ManagementStudent] SET COMPATIBILITY_LEVEL = 110
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [ManagementStudent].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [ManagementStudent] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [ManagementStudent] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [ManagementStudent] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [ManagementStudent] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [ManagementStudent] SET ARITHABORT OFF 
GO
ALTER DATABASE [ManagementStudent] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [ManagementStudent] SET AUTO_CREATE_STATISTICS ON 
GO
ALTER DATABASE [ManagementStudent] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [ManagementStudent] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [ManagementStudent] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [ManagementStudent] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [ManagementStudent] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [ManagementStudent] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [ManagementStudent] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [ManagementStudent] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [ManagementStudent] SET  ENABLE_BROKER 
GO
ALTER DATABASE [ManagementStudent] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [ManagementStudent] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [ManagementStudent] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [ManagementStudent] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [ManagementStudent] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [ManagementStudent] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [ManagementStudent] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [ManagementStudent] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [ManagementStudent] SET  MULTI_USER 
GO
ALTER DATABASE [ManagementStudent] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [ManagementStudent] SET DB_CHAINING OFF 
GO
ALTER DATABASE [ManagementStudent] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [ManagementStudent] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
USE [ManagementStudent]
GO
/****** Object:  Table [dbo].[account]    Script Date: 11/10/2019 11:19:07 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[account](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[username] [nvarchar](50) NULL,
	[password] [nvarchar](50) NULL,
	[type] [int] NULL,
	[status] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[mark]    Script Date: 11/10/2019 11:19:07 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[mark](
	[id] [int] NULL,
	[subject] [nvarchar](50) NULL,
	[mark] [float] NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[student]    Script Date: 11/10/2019 11:19:07 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[student](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[roll_number] [nvarchar](50) NULL,
	[full_name] [nvarchar](100) NULL,
	[gender] [bit] NULL,
	[email] [nvarchar](100) NULL,
	[phone_number] [nvarchar](100) NULL,
	[address] [nvarchar](2000) NULL,
	[mark_id] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET IDENTITY_INSERT [dbo].[account] ON 

INSERT [dbo].[account] ([id], [username], [password], [type], [status]) VALUES (2, N'Nga', N'123456', 1, 1)
INSERT [dbo].[account] ([id], [username], [password], [type], [status]) VALUES (3, N'Nga', N'*****', 1, 1)
INSERT [dbo].[account] ([id], [username], [password], [type], [status]) VALUES (4, N'MAB', N'123456', 2, 2)
INSERT [dbo].[account] ([id], [username], [password], [type], [status]) VALUES (5, N'Staff', N'1234567', 3, 3)
INSERT [dbo].[account] ([id], [username], [password], [type], [status]) VALUES (6, N'admin', N'123456', 2, 1)
SET IDENTITY_INSERT [dbo].[account] OFF
INSERT [dbo].[mark] ([id], [subject], [mark]) VALUES (1, N'Math', 9)
INSERT [dbo].[mark] ([id], [subject], [mark]) VALUES (1, N'English', 8)
INSERT [dbo].[mark] ([id], [subject], [mark]) VALUES (1, N'Literature', 7)
INSERT [dbo].[mark] ([id], [subject], [mark]) VALUES (1, N'History', 10)
SET IDENTITY_INSERT [dbo].[student] ON 

INSERT [dbo].[student] ([id], [roll_number], [full_name], [gender], [email], [phone_number], [address], [mark_id]) VALUES (1, N'HE130866', N'Luong Duc Minh', 1, N'minhldhe130866@fpt.edu.vn', N'0964890966', N'HN', 1)
INSERT [dbo].[student] ([id], [roll_number], [full_name], [gender], [email], [phone_number], [address], [mark_id]) VALUES (3, N'he130461', N'hangnt', 0, N'hangnthe130461@fpt.edu.vn', N'0942578685', N'nd', 2)
SET IDENTITY_INSERT [dbo].[student] OFF
USE [master]
GO
ALTER DATABASE [ManagementStudent] SET  READ_WRITE 
GO
